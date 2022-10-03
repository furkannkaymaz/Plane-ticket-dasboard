package com

import androidx.lifecycle.Observer
import androidx.test.platform.app.InstrumentationRegistry
import com.commerce.data.repository.HomeRepository
import com.commerce.ui.home.viewmodel.HomeViewModel
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainActivityViewModelTest {

    @get:Rule
    val coroutineRule = MainCoroutineRule()

    @Mock
    private lateinit var dataRepository: HomeRepository

    @InjectMocks
    private lateinit var mainActivityViewModel: HomeViewModel

    @Mock
    private lateinit var dataObserver: Observer<Result<List<Character>>>

    @Test
    fun fetchCharacters() {
        runBlockingTest {
            Mockito.`when`(dataRepository.getData(InstrumentationRegistry.getInstrumentation().context))
                .thenreturn(Result.success(listOf(Character (
                    Name=A,
                    Type=hero))))

            mainActivityViewModel.fetchCharacters()
            mainActivityViewModel.charactersLiveData.observeForever(dataObserver)
            Mockito.verify(dataRepository).getCharacters()
            Mockito.verify(dataObserver).onChanged(Result.success(listOf(Character (
                Name=A,
                Type=hero))))
            mainActivityViewModel.charactersLiveData.removeObserver(dataObserver)
        }
    }

}