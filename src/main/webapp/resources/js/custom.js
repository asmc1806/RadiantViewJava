"use strict";

// VALIDACIONES


function ValInisesion(){

  event.preventDefault();
  var Correo = $('#TxtCorreo').val();
  var Contraseña = $('#TxtContraseña').val();
  var ValCorreo = /^[a-zA-Z0-9._%+-]+(?:-[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  var ValContraseña = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?":{}|<>])[A-Za-z\d!@#$%^&*(),.?":{}|<>]{8,}$/;
  
  if(Correo == ''){
    alert('El campo Correo No puede estar vacío');
    $('#TxtCorreo').focus();
    return false;
  }else if(!(ValCorreo.test(Correo))){
    alert('El campo Correo No es válido');
    $('#TxtCorreo').focus();
    return false;
  }else if(Contraseña == ''){
    alert('El campo Contraseña No puede estar vacío');
    $('#TxtContraseña').focus();
    return false;
  }else if(!(ValContraseña.test(Contraseña))){
    alert('La contraseña al menos debe contener:\nUna mayúscual \nUna minúscula \nUn número \nAlgún carácter especial !@#$%^&*(). \nY una longitud mínima de 8 caracteres.');
    $('#TxtContraseña').focus();
    return false;
  }else{
    iniciarSesion();
    return true;
  }
}

function ValRecContras(){

  var Correo = $('#TxtCorreo').val();
  var ValCorreo = /^[a-zA-Z0-9._%+-]+(?:-[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

  if(Correo == ''){
    alert('El campo Correo No puede estar vacío');
    $('#TxtCorreo').focus();
    return false;
  }else if(!(ValCorreo.test(Correo))){
    alert('El campo Correo No es válido');
    $('#TxtCorreo').focus();
    return false;
  }else{
    window.alert('Se le enviara un correo con el enlace para el cambio de contraseña');
    return true;
  }
}

function ValCamContras(){
  
  var Contraseña = $('#TxtContraseña').val();
  var ConfContraseña = $('#TxtConfContraseña').val();
  var ValContraseña = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?":{}|<>])[A-Za-z\d!@#$%^&*(),.?":{}|<>]{8,}$/;
  
  if(Contraseña == ''){
    alert('El campo Contraseña Nueva No puede estar vacío');
    $('#TxtContraseña').focus();
    return false;
  }else if(!(ValContraseña.test(Contraseña))){
    alert('La contraseña al menos debe contener:\nUna mayúscual \nUna minúscula \nUn número \nAlgún carácter especial !@#$%^&*(). \nY una longitud mínima de 8 caracteres.');
    $('#TxtContraseña').focus();
    return false;
  }else if(ConfContraseña == ''){
    alert('El campo Confirmar Contraseña No puede estar vacío');
    $('#TxtConfContraseña').focus();
    return false;
  }else if(!(Contraseña === ConfContraseña)){
    alert('Las contraseñas no son iguales, debe volver a digitarlas.');
    $('#TxtContraseña').focus();
    return false;
  }else{
    window.alert('Cambio de contraseña exitoso');
    return true;
  }
}

function ValRegPaciente(){

  event.preventDefault();
  var Correo = $('#TxtCorreo').val();
  var ValCorreo = /^[a-zA-Z0-9._%+-]+(?:-[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

  var Contraseña = $('#TxtContraseña').val();
  var ConfContraseña = $('#TxtConfContraseña').val();
  var ValContraseña = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?":{}|<>])[A-Za-z\d!@#$%^&*(),.?":{}|<>]{8,}$/;

  if($('#TxtNombres').val() == ''){
    alert('El campo Nombre No puede estar vacío');
    $('#TxtNombres').focus();
    return false;
  }else if($('#TxtApellidos').val() == ''){
    alert('El campo Apellidos No puede estar vacío');
    $('#TxtApellidos').focus();
    return false;
  }else if($('#SelDocumento').val() == ''){
    alert('El campo Tipo De Documento No puede estar vacío');
    $('#SelDocumento').focus();
    return false;
  }else if($('#TxtDocumento').val() == ''){
    alert('El campo Documento No puede estar vacío');
    $('#TxtDocumento').focus();
    return false;
  }else if($('#TxtEdad').val() == ''){
    alert('El campo Edad No puede estar vacío');
    $('#TxtEdad').focus();
    return false;
  }else if($('#TxtDireccion').val() == ''){
    alert('El campo Dirección No puede estar vacío');
    $('#TxtDireccion').focus();
    return false;
  }else if($('#TxtTelefono').val() == '' || $('#TxtTelefono').val().length < 10){
    alert('El campo Telefono No puede estar vacío o menor a 10 digitos');
    $('#TxtTelefono').focus();
    return false;
  }else if(!(ValCorreo.test(Correo))){
    alert('El campo Correo No es válido');
    $('#TxtCorreo').focus();
    return false;
  }else if(Contraseña == ''){
    alert('El campo Contraseña No puede estar vacío');
    $('#TxtContraseña').focus();
    return false;
  }else if(!(Contraseña === ConfContraseña)){
    alert('Las contraseñas no son iguales, debe volver a digitarlas.');
    $('#TxtConfContraseña').focus();
    return false;
  }else if(!(ValContraseña.test(Contraseña))){
    alert('La contraseña al menos debe contener:\nUna mayúscual \nUna minúscula \nUn número \nAlgún carácter especial !@#$%^&*(). \nY una longitud mínima de 8 caracteres.');
    $('#TxtContraseña').focus();
    return false;
  }else{
    agregarUsuario(); 
    return true;
  }
}

function EdiValRegPaciente(){
  event.preventDefault();
  var Correo = $('#EdiTxtCorreo').val();
  var ValCorreo = /^[a-zA-Z0-9._%+-]+(?:-[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

  var Contraseña = $('#EdiTxtContraseña').val();
  var ConfContraseña = $('#EdiTxtConfContraseña').val();
  var ValContraseña = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?":{}|<>])[A-Za-z\d!@#$%^&*(),.?":{}|<>]{8,}$/;

  if($('#EdiTxtNombres').val() == ''){
    alert('El campo Nombre No puede estar vacío');
    $('#EdiTxtNombres').focus();
    return false;
  }else if($('#EdiTxtApellidos').val() == ''){
    alert('El campo Apellidos No puede estar vacío');
    $('#EdiTxtApellidos').focus();
    return false;
  }else if($('#EdiSelDocumento').val() == ''){
    alert('El campo Tipo De Documento No puede estar vacío');
    $('#EdiSelDocumento').focus();
    return false;
  }else if($('#EdiTxtDocumento').val() == ''){
    alert('El campo Documento No puede estar vacío');
    $('#EdiTxtDocumento').focus();
    return false;
  }else if($('#EdiTxtEdad').val() == ''){
    alert('El campo Edad No puede estar vacío');
    $('#EdiTxtEdad').focus();
    return false;
  }else if($('#EdiTxtDireccion').val() == ''){
    alert('El campo Dirección No puede estar vacío');
    $('#EdiTxtDireccion').focus();
    return false;
  }else if($('#EdiTxtTelefono').val() == '' || $('#EdiTxtTelefono').val().length < 10){
    alert('El campo Telefono No puede estar vacío o menor a 10 digitos');
    $('#EdiTxtTelefono').focus();
    return false;
  }else if(!(ValCorreo.test(Correo))){
    alert('El campo Correo No es válido');
    $('#EdiTxtCorreo').focus();
    return false;
  }else if(Contraseña == ''){
    alert('El campo Contraseña No puede estar vacío');
    $('#EdiTxtContraseña').focus();
    return false;
  }else if(!(Contraseña === ConfContraseña)){
    alert('Las contraseñas no son iguales, debe volver a digitarlas.');
    $('#EdiTxtConfContraseña').focus();
    return false;
  }else if(!(ValContraseña.test(Contraseña))){
    alert('La contraseña al menos debe contener:\nUna mayúscula \nUna minúscula \nUn número \nAlgún carácter especial !@#$%^&*(). \nY una longitud mínima de 8 caracteres.');
    $('#EdiTxtContraseña').focus();
    return false;
  }else if($('#EdiSelUsuario').val() == ''){
    alert('El campo Tipo De Usuario No puede estar vacío');
    $('#EdiSelUsuario').focus();
    return false;
  }else{
    editarUsuario(); 
    return true;
  }
}


// ACCIONES

function iniciarSesion() {
  let correo = $('#TxtCorreo').val();
  let contra = $('#TxtContraseña').val();

  fetch('../controllers/UsuarioController.php?url=AutenticarUsuario', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ correo, contra })
  })
  .then(response => response.json())
  .then(data => {
    console.log("Respuesta del servidor:", data);
    if (data.success) {
      alert("!Inicio de sesión exitoso¡");
      window.location.href = "PagPrincipal.php";
    } else {
      alert("Error: " + data.message);
    }
  })
  .catch(error => console.error("Error en fetch:", error));
}


function agregarUsuario() {
  let nombre = $('#TxtNombres').val();
  let apellido = $('#TxtApellidos').val();
  let tipdoc = $('#SelDocumento').val();
  let doc = $('#TxtDocumento').val();
  let edad = $('#TxtEdad').val();
  let dir = $('#TxtDireccion').val();
  let tel = $('#TxtTelefono').val();
  let correo = $('#TxtCorreo').val();
  let contra = $('#TxtContraseña').val();
  let rol = 3;

  fetch('../controllers/UsuarioController.php?url=RegistrarUsuario', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({tipdoc, doc, nombre, apellido, tel, dir, edad, correo, contra, rol})
  })
  .then(response => {
    if (!response.ok) {
      throw new Error('Error en la red');
    }
    return response.json();
  })
  .then(data => {
    if (data.success) {
      alert('¡Usuario registrado!');
      window.location.href = "IniSesion.php";
    } else {
      if (data.error === 'duplicate_document') {
        alert('Error ya existe un usuario con este número de documento');
        $('#TxtDocumento').focus().addClass('is-invalid');
      } else {
        alert('Error: ' + data.message);
      }
    }
  })
  .catch(error => {
    console.error("Error en fetch:", error);
    alert('Error al conectar con el servidor');
  });
}
function listarUsuarios() {
  fetch('../controllers/UsuarioController.php?url=VerUsuario')
    .then(response => response.json())
    .then(data => {
      if (data.success) {
        const usuarios = data.data;
        let tabla = document.getElementById('TablaUsuarios');
        tabla.innerHTML = '';
        usuarios.forEach(data => {
          let fila = `<tr>
                        <input type="hidden" Id="IdUsuario" name="IdUsuario" value="${data.ID_Usuario}">
                        <td>${data.Tipo_Documento}</td>
                        <td>${data.Documento_Usuario}</td>
                        <td>${data.Nombres_Usuario}</td>
                        <td>${data.Apellidos_Usuario}</td>
                        <td>${data.Telefono_Usuario}</td>
                        <td>${data.Correo_Usuario}</td>
                        <td>${data.Nombre_Rol}</td>
                        <td>
                        <a class="" title="Editar Usuario" data-toggle="modal" data-target="#ModalEditar"><i class="fa fa-pencil-square fa-2x" onclick='mostrarModalEditar(${JSON.stringify(data)});'></i></a>
                        <a class="" title="Eliminar Usuario" ><i class="fa fa-trash fa-2x" onclick='eliminarUsuario(${data.ID_Usuario});'></i></a>  
                        </td>
                      </tr>`;
          tabla.innerHTML += fila;
        });
      } else {
        console.error("No se pudieron cargar los usuarios");
      }
    })
    .catch(error => console.error("Error al listar usuarios:", error));
}

function mostrarModalEditar(usuario) {
//  document.getElementById("ModalEditar").style.display = "flex";
  $('#IdUsuario').val(usuario.ID_Usuario);
  $('#EdiTxtNombres').val(usuario.Nombres_Usuario);
  $('#EdiTxtApellidos').val(usuario.Apellidos_Usuario);
  $('#EdiSelDocumento').val(usuario.Tipo_Documento);
  $('#EdiTxtDocumento').val(usuario.Documento_Usuario);
  $('#EdiTxtEdad').val(usuario.Edad);
  $('#EdiTxtDireccion').val(usuario.Direccion_Usuario);
  $('#EdiTxtTelefono').val(usuario.Telefono_Usuario);
  $('#EdiTxtCorreo').val(usuario.Correo_Usuario);
  $('#EdiTxtContraseña').val("$0p0rt3MST*");
  $('#EdiTxtConfContraseña').val("$0p0rt3MST*");
  $('#EdiSelUsuario').val(usuario.Rol_ID_Rol);
}

function cerrarModal() {
  document.getElementById("modalEditar").style.display = "none";
}

function editarUsuario() {
  let id  = $('#IdUsuario').val();
  let nombre = $('#EdiTxtNombres').val();
  let apellido = $('#EdiTxtApellidos').val();
  let tipdoc = $('#EdiSelDocumento').val();
  let doc = $('#EdiTxtDocumento').val();
  let edad = $('#EdiTxtEdad').val();
  let dir = $('#EdiTxtDireccion').val();
  let tel = $('#EdiTxtTelefono').val();
  let correo = $('#EdiTxtCorreo').val();
  let contra = $('#EdiTxtContraseña').val();
  let rol = $('#EdiSelUsuario').val();
  fetch(`../controllers/UsuarioController.php?url=ActualizarUsuario`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({id, tipdoc, doc, nombre, apellido, tel, dir, edad, correo, contra, rol})
  })
  .then(response => response.json())
  .then(data => {
    console.log("Respuesta del servidor:", data);
    if (data.success) {
      alert("!Usuario modificado con exitoso¡");
      listarUsuarios();
    } else {
      alert("Error: " + data.message);
    }
  })
  .catch(error => console.error("Error en fetch:", error));
}

function eliminarUsuario(idUsuario) {
  if (!confirm("¿Esta seguro que desea eliminar el usuario?")) return;
  let id  = idUsuario
  fetch('../controllers/UsuarioController.php?url=EliminarUsuario', {
    method: 'DELETE',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({id: id})
  })
  .then(response => response.json())
  .then(data => {
    console.log("Respuesta del servidor:", data);
    if (data.success) {
      alert("!Usuario Eliminado con exitoso¡");
      listarUsuarios();
    } else {
      alert("Error: " + data.message);
    }
  })
  .catch(error => console.error("Error en fetch:", error));
}

function generarPdf(){
  let nombre = $('#RepTxtNombres').val();
  let tpDoc = $('#RepSelDocumento').val();
  let doc = $('#RepTxtDocumento').val();
  let tpusu = $('#RepSelUsuario').val();
    
  if (nombre !== "") {
    let url = 'GenerarPdfPer.php?'+'nombres='+encodeURIComponent(nombre);
    window.open(url, '_black');
  } else if (tpDoc !== "") {
    let url = 'GenerarPdfPer.php?'+'tpdoc='+encodeURIComponent(tpDoc);
    window.open(url, '_black');
  } else if (doc !== "") {
    let url = 'GenerarPdfPer.php?'+'doc='+encodeURIComponent(doc);
    window.open(url, '_black');
  } else if (tpusu !== "") {
    let url = 'GenerarPdfPer.php?'+'tpusu='+encodeURIComponent(tpusu);
    window.open(url, '_black');
  }  
}

$(document).ready(function () {
  $("#RegUsuario").submit(ValRegPaciente);
  $("#IniSesion").submit(ValInisesion);
  if (window.location.pathname.includes("Usuarios.php")) {
    listarUsuarios(); 
  }

  $('#sidebarCollapse').on('click', function () {
    $('#sidebar').toggleClass('active');
  });
});

