document.addEventListener("DOMContentLoaded", function () {
    const loginSection = document.getElementById("login-section");
    const menuSection = document.getElementById("menu-section");
    const loginForm = document.getElementById("login-form");

    loginForm.addEventListener("submit", function (event) {
        event.preventDefault(); // Evitar envío del formulario

        // Aquí deberías realizar la lógica de autenticación
        // Si la autenticación es exitosa, muestra la sección del menú
        loginSection.style.display = "none";
        menuSection.style.display = "block";
    });

    // Aquí puedes agregar las acciones para cada opción del menú
    const mostVotedOption = document.getElementById("most-voted");
    const listVotesOption = document.getElementById("list-votes");
    const voteDetailOption = document.getElementById("vote-detail");
    const addEntityOption = document.getElementById("add-entity");
    const changePasswordOption = document.getElementById("change-password");

    mostVotedOption.addEventListener("click", function (event) {
        event.preventDefault();
        // Lógica para la opción "Postulantes más votados"
    });

    listVotesOption.addEventListener("click", function (event) {
        event.preventDefault();
        // Lógica para la opción "Listar votos ingresados"
    });

    voteDetailOption.addEventListener("click", function (event) {
        event.preventDefault();
        // Lógica para la opción "Ver detalle de voto"
    });

    addEntityOption.addEventListener("click", function (event) {
        event.preventDefault();
        // Lógica para la opción "Agregar nueva entidad"
    });

    changePasswordOption.addEventListener("click", function (event) {
        event.preventDefault();
        // Lógica para la opción "Modificar clave del usuario"
    });
});