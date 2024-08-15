package mx.edu.uttt.logincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import mx.edu.uttt.logincompose.app.PostOfficeAppRouter
import mx.edu.uttt.logincompose.app.Screen
import mx.edu.uttt.logincompose.components.HeadingTextComponents
import mx.edu.uttt.logincompose.naviagation.SystemBackButtonHandler

@Composable
fun TerminosCondicionesScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp)
    ) {
        HeadingTextComponents(value = "Terminos de Uso")
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}