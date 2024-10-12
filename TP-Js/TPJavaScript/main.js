//2
const a= 5;
const b =10;
const c= a+b;
console.log("EL valor de a es ", a);
console.log("El valor de b es ",b);
console.log("La suma de los numeros es ", c)

//3
const nombre = prompt("Ingresá tu nombre: ");
const apellido = prompt("Ingresá tu apellido: ");
console.log("Hola", nombre, apellido, "Como estas?")
 
//2.1
const a2= 10;
const b2=5;
if(a2>b2){
  const c =a2;
  console.log("El numero mayor es" , c);
}else if (b2>a2)
{
  const c=b2;
  console.log("El numero mayor es" , c);
}
else{
console.log("Los numeros son iguales");
}

//2.2
const numeroIngresado= prompt("Ingresá un número");

if(numeroIngresado%2==0)
{
  console.log("El numero", numeroIngresado ,"es par");
}else{
  console.log("El numero", numeroIngresado ,"es impar");
}

//3.1
let numeroResta = 10;
while(numeroResta>0){
  console.log(numeroResta);
  numeroResta--;
  
}
//3.2
let numeroCien ;
do {
  numeroCien = prompt("Ingrese un número mayor a 100:");
} while (numeroCien <= 100 || isNaN(numeroCien)); 

console.log("Ingresaste un número mayor a 100:" , numeroCien);

//4.1
const numeroPar2 = 7;

function esPar2(numero) {
  const resultado= numero % 2 === 0; 
  console.log(`El número ${numero} es par: ${resultado}`)
  return resultado;
}

esPar2(numeroPar2);

//4.2
function convertirCelsiusAFahrenheit(celsius) {
  return celsius * 1.8 + 32
}

console.log(`30°C son equivalentes a ${convertirCelsiusAFahrenheit(30)}°F`)

//5.1
const persona = {
  nombre: "Lautaro",
  edad: 20,
  ciudad: "Mendoza, Ciudad"
}
console.log("Nombre:",persona.nombre,"Edad:",persona.edad,"Ciudad:",persona.ciudad);

function cambiarCiudad (persona, nuevaCiudad) {
  persona.ciudad = nuevaCiudad; 
}
cambiarCiudad(persona, "Mendoza")
console.log("Nombre:",persona.nombre,"Edad:",persona.edad,"Ciudad:",persona.ciudad);

//5.2
const libro=
{
  titulo:"Don Quijote de la Mancha ",
  autor:"Miguel de Cervantes",
  año:"1605"
}
function libroAntiguo(libro){
  const diferencia=2024-libro.año;
  if(diferencia>10)
  {
    console.log("El libro se publicó hace",diferencia,"años, es antiguo");
  }else{
    console.log("El libro se publicó hace",diferencia,"años, no es antiguo");
  }
}

libroAntiguo(libro);


//6.1
const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let arrayMultiplicado = []
for (let el of array) {
  arrayMultiplicado.push(el * 2)
}
console.log("Array original:", {array})
console.log("Array multiplicado por 2:", {arrayMultiplicado})

const pares = [];

for (let i = 0; i <= 20; i++) {
    if (i % 2 === 0) { 
        pares.push(i); 
    }
}

console.log("Array de los primeros 10 números pares:", pares);


function cambiarColor() {
  
  const elementosP = document.querySelectorAll('p');

  elementosP.forEach(function(p) {
      p.style.color = 'blue';
  });
}

document.getElementById('cambiarColorBtn').addEventListener('click', cambiarColor);

const formulario = document.getElementById('miFormulario');

formulario.addEventListener('submit', function(event) {
    event.preventDefault(); 
    
    const valorCampoTexto = document.getElementById('campoTexto').value;

    alert(`El valor ingresado es: ${valorCampoTexto}`);
});


const lista = document.getElementById('miLista');

const elementosLi = lista.getElementsByTagName('li');


for (let i = 0; i < elementosLi.length; i++) {
    elementosLi[i].addEventListener('click', function() {
        console.log(`Texto del elemento: ${this.textContent}`);
    });
}

const campoTexto = document.getElementById('campoTexto1');
const btnDeshabilitar = document.getElementById('btnDeshabilitar');
const btnHabilitar = document.getElementById('btnHabilitar');


btnDeshabilitar.addEventListener('click', function() {
    campoTexto.disabled = true; 
    btnDeshabilitar.disabled = true; 
    btnHabilitar.disabled = false; 
});


btnHabilitar.addEventListener('click', function() {
    campoTexto.disabled = false; 
    btnDeshabilitar.disabled = false; 
    btnHabilitar.disabled = true; 
});

const formulario1 = document.getElementById('miFormulario1');
const campoEmail = document.getElementById('campoEmail');
const correoGuardadoDiv = document.getElementById('correoGuardado');
const btnEliminar = document.getElementById('btnEliminar');


function cargarCorreo() {
    const correo = localStorage.getItem('correoEmail');
    if (correo) {
        mostrarCorreo(correo);
    }
}


function mostrarCorreo(correo) {
    correoGuardadoDiv.textContent = `Correo guardado: ${correo}`;
    btnEliminar.style.display = 'inline'; 
}

formulario1.addEventListener('submit', function(event) {
    event.preventDefault(); 
    const correo = campoEmail.value;
    localStorage.setItem('correoEmail', correo);
    mostrarCorreo(correo);
    campoEmail.value = '';
});

btnEliminar.addEventListener('click', function() {
    localStorage.removeItem('correoEmail');
    correoGuardadoDiv.textContent = ''; 
    btnEliminar.style.display = 'none'; 
});

cargarCorreo();

