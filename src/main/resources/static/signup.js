window.addEventListener('load', function () {

    const form = document.querySelector('#formRegistro');
    const nombre = document.querySelector('#nombre');
    const apellido = document.querySelector('#apellido');
    const documento = document.querySelector('#documento');
    const email = document.querySelector('#email');
    const contrasena = document.querySelector('#constraseña');

        form.addEventListener('submit', function (event) {
            event.preventDefault();

            const payload = {
                nombre: nombre.value,
                apellido: apellido.value,
                documento: documento.value,
                email: email.value,
                contrasena: contrasena.value
            };

            const settings = {
                method: 'POST',
                body: JSON.stringify(payload),
                headers: {
                    'Content-Type': 'application/json'
                }
            };

            realizarRegister(settings);


            form.reset();
        });

});