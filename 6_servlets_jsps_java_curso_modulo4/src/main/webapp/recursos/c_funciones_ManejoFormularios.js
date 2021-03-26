function validarForma(forma){
    //Validamos usuario
    var usuario=forma.usuario;
    if(usuario.value==""||usuario.value=="Escribir Usuario"){
        alert("Debe de proporcionar un nombre de Usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    //Validamos password
    var password=forma.password;
    if(password.value==""||password.value.length<3){
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    //Validamos las tecnoligias de interes
    var tecnologias=forma.tecnologia;
    var checkSeleccionado=false;
    //Revisamos si se selecciono algun check
    for(i=0;i<tecnologias.length;i++){
        if(tecnologias[i].checked){
        checkSeleccionado=true;
        }
    }
    if(!checkSeleccionado){
        alert("El usuario debe proporcionar al menos una tecnologia");
        return false;
    }
    
    //Validamos el Genero
    var generos=forma.genero;
    var radioSeleccionado=false;
    //Revisamos si se selecciono algun radioButton
    for(i=0;i<generos.length;i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
    if(!radioSeleccionado){
        alert("El usuario debe seleccionar el genero");
        return false;
    }
    
    //Validar ocupacion
    var ocupacion=forma.ocupacion;
    if(ocupacion.value==""){
        alert("El usuario debe solucionar una ocupacion");
        return false;
    }
        
    //Formulario Valido
    alert("Formulario Valido\nEnviando Datos");
    return true;
}