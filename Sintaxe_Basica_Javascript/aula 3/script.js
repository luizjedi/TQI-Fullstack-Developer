// O que são vetores ou arrays

// Arrays
let array = [1, 'nome', true];
console.log(array);

// Array de objetos
let arrayObj = [1, 'text', true, ['array1', false], ['true', true], ['array3', 2], [5, ['array', 3, false]]];
console.log(arrayObj);

// ForEach
arrayObj.forEach(function (item, index) { console.log(item, index) });

// Push - add objeto no final do array
arrayObj.push(32);
console.log(arrayObj);

// Pop - remove o ultimo objeto do array
arrayObj.pop();
console.log(arrayObj);

// Shift - remove o primeiro objeto do array
arrayObj.shift();
console.log(arrayObj);

// Unshift - Adiciona um novo item no inicio do array
arrayObj.unshift('Novo objeto');
console.log(arrayObj);

// IndexOf - Retorna o índice da primeira ocorrência do tipo solicitado 
console.log(arrayObj.indexOf('text'));

// Splice - Deleta ou substitui um item por um índice
arrayObj.splice(0, 3);
console.log(arrayObj);

// Objetos

let objeto = { string: 'string', number: 1, boolean: true, array: ['array'], objetoInterno: { objeto: 'objeto interno' } };
console.log(objeto);

// Desestruturação
var objetoInterno = objeto.objetoInterno;
console.log(objetoInterno);

var str = objeto.string;
console.log(str);

var number = objeto.number;
console.log(number);

var { string, number, boolean } = objeto;
console.log(string, number, boolean);