var currentNumber = document.getElementById('currentNumber');
var currentNumberCount = 0;

function changeColor() {
    var backgroundColor = document.getElementsByTagName('body')[0];
    var currentColor = document.getElementsByTagName('span')[0];

    if (currentNumberCount == 0) {
        backgroundColor.style.backgroundColor = 'cornflowerblue';
        return currentColor.style.color = 'blue';
    }
    else if (currentNumberCount > 0) {
        backgroundColor.style.backgroundColor = 'darkseagreen';
        return currentColor.style.color = 'green';
    }
    else {
        backgroundColor.style.backgroundColor = 'lightcoral';
        return currentColor.style.color = 'red';
    } 
}

function isDisableSub() {
    var buttonSub = document.getElementsByTagName('button')[0];

    if (currentNumberCount <= -10) {
        var buttonAdd = document.getElementsByTagName('button')[1];
        buttonAdd.disabled = false;
        buttonSub.disabled = true;
        return;
    }
    return buttonSub.disabled = false;
}

function isDisableAdd() {
    var buttonAdd = document.getElementsByTagName('button')[1];

    if (currentNumberCount >= 10) {
        var buttonSub = document.getElementsByTagName('button')[0];
        buttonSub.disabled = false;
        buttonAdd.disabled = true;
        return;
    }
    return buttonAdd.disabled = false;
}

function increment() {
    currentNumberCount++;
    this.isDisableSub();
    this.isDisableAdd();
    currentNumber.innerHTML = currentNumberCount;
    this.changeColor();
}

function decrement() {
    currentNumberCount--;
    this.isDisableSub();
    this.isDisableAdd();
    currentNumber.innerHTML = currentNumberCount;
    this.changeColor();
}
