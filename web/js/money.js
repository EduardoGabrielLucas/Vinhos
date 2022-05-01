/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
   $('.money').mask('000.000.000.000.000,00', {reverse: true});
  
  $(".money").change(function(){
    $("#value").html($(this).val().replace(/\D/g,''))
  })
  
});

