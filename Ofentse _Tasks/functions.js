//Function that converts pounds to Kg
function poundstoKg (pounds) {
    return pounds * 0.4535
}
console.log()
//Arrow function
let poundsToKg = (pounds) => {return pounds * 0.4535}

// Function that converts Inches to C
function inchesToCm (inches){
    return inches * 2.54
} 
console.log(inchesToCm())

let inchesToCm = (inches) => {return inches * 2.54}


// Function that converts F to C
function fahrenheitToCelsius (fahrenheit) {
    return fahrenheit - 32 * 5/9
}
console.log(fahrenheitToCelsius())

let fahrenheit = (fahrenheit) => {return fahrenheit - 32 * 5/9}

//Function to convert Feet to Metres
function feetToM (feet) {
    return feet * 0.3048
}
console.log(feetToM())
let feetToM = (feet) => {return feet * 0.3048}