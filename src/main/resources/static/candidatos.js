document.addEventListener('DOMContentLoaded', function() {
    fetch('/candidatos')
        .then(response => response.json())
        .then(data => {
            const selectElement = document.getElementById('#candidato');

            data.forEach(candidato => {
                const option = document.createElement('option');
                option.value = candidato.id;
                option.textContent = candidato.nombre; +' '+candidato.apellido
                selectElement.appendChild(option);
            });
        })
        .catch(error => {
            console.error('Error al obtener los datos de los candidatos:', error);
        });
});

//NO LOGRO QUE EN LA PANTALLA DE VOTACIÓN ME DESPLIEGUE LOS CANDIDATOS

