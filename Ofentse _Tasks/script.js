function getformvalues() { 
let first_name = document.getElementById("fname").value;
let last_name = document.getElementById("lname").value;
let identity_number = document.getElementById("Id").value;

console.log (`
first name:${first_name} \n
last name :${last_name} \n
identity number:${identity_number} \n
`);
}