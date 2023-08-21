// Acá tengo que capturar el botón "Ingresar" y mostrar una lista oculta
//con InnerHTML insertar una lista de la votación
//ordenado por los mas votados

function mostrarResultados(candidatos) {
    var resultadosDiv = document.getElementById("resultadosVotacion");
    var resultadosHTML = "<h3>Candidatos más votados:</h3><ul>";

    for (var i = 0; i < candidatos.length; i++) {
        resultadosHTML += "<li>" + candidatos[i].nombre + ": " + candidatos[i].votos + " votos</li>";
    }

    resultadosHTML += "</ul>";
    resultadosDiv.innerHTML = resultadosHTML;
}