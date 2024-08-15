package mx.edu.uttt.logincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import mx.edu.uttt.logincompose.R
import mx.edu.uttt.logincompose.app.PostOfficeAppRouter
import mx.edu.uttt.logincompose.app.Screen
import mx.edu.uttt.logincompose.components.ButtonComponent
import mx.edu.uttt.logincompose.components.CheckboxComponent
import mx.edu.uttt.logincompose.components.DividerTextComponent
import mx.edu.uttt.logincompose.components.HeadingTextComponents
import mx.edu.uttt.logincompose.components.NormalTextComponents
import mx.edu.uttt.logincompose.components.TextFieldName

@Composable
fun SignUpScreen(){
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            NormalTextComponents(value = "Hey, Registrate")
            HeadingTextComponents(value = "Crea una cuenta")
            Spacer(modifier=Modifier.height(20.dp))
            TextFieldName(labelValue = "Nombre",
                painterResource(id = R.drawable.baseline_co_present_24 )
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Apellidos",
                painterResource(id = R.drawable.baseline_person_add_24))
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Correo",
                painterResource(id = R.drawable.baseline_email_24))
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Password",
                painterResource(id = R.drawable.baseline_fingerprint_24))
            CheckboxComponent(value = "Para continuar deberas aceptar los terminos y condiciones",
            onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.TerminosCondicionesScreen)
            })
            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(value = "Registrate")
            Spacer(modifier = Modifier.height(10.dp))
            DividerTextComponent()
        }
    }
}