// Desafio 1

// function inseto() {

//     let input = Number(prompt("Valores: "));

//     let qtdEntradas = parseInt(input);
//     let nivelEnergia;

//     for (let i = 0; i < qtdEntradas; i++) {
//         input = Number(prompt("Poder: "));
//         nivelEnergia = parseInt(input);

//         if (100 <= nivelEnergia <= 100000 && nivelEnergia <= 8000) {
//            return alert("Inseto!")
//         } else {
//            return alert("Mais de 8000!")
//         }
//     }
// }

// this.inseto();

// Desafio 2

// const inputA = Number(prompt("Valor de A: "));
// const inputB = Number(prompt("Valor de B: "));
// const total = ((inputA + inputB) * (inputB - inputA + 1)) / 2;
// alert("Total: " + total);

// Desafio 3

// function melhor() {

//     let input = Number(prompt("Numero de Entradas: "));

//     let qtdEntradas = parseFloat(input);
//     let melhor = 999;

//     for (let i = 0; i < qtdEntradas; i++) {
//         input = Number(prompt("Tempo: "));
//         let tempo = parseFloat(input);

//         if (tempo < melhor) melhor = tempo;
//     }
//     return alert("Melhor: " + melhor);

// }

// this.melhor();

// Desafio 4

// function pares() {
//     var array = [2, 3, 5, 7, 11, 13, 18, 34];

//     for (let i = 0; i < array.length; i++) {
//         if (array[i] % 2 === 0) {
//             console.log("Array: " + array[i]);
//         }
//     }
// }

// this.pares();

// Desafio 5

function partidas() {
    let lines = Number(prompt("Número de equipes: "));

    var numberOfMatches = parseInt(lines);

    let n = parseInt(lines);
    let totalMatches = 0;
    while (n > 1) {
        if (n % 2 === 0) {
            numberOfMatches = n / 2;
            n = n / 2;
            totalMatches += numberOfMatches;
        } else {
            numberOfMatches = (n - 1) / 2; 
            n = ((n - 1) / 2) + 1;
            totalMatches += numberOfMatches;
        }
    }
    console.log("Partidas jogadas: " + totalMatches);
}

this.partidas();



