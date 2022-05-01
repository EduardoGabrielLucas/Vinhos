/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function clicar() {
    var num1 = document.querySelector(".num1").value;
    var num2 = document.querySelector(".num2").value;
   
    var resultado = parseInt(num1) + parseInt(num2);
    document.querySelector(".resultado").innerHTML = resultado;
}



function calcular() {
  var n1 = parseInt(document.getElementById('n1').value, 10);
  var n2 = parseInt(document.getElementById('n2').value, 10);
  document.getElementById('resultado').innerHTML = n1 + n2;
}

