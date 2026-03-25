// q1
console.log('問題1');

console.log('伊藤美空');

// q2
console.log('問題2');

let firstName = 'Miku';
let lastName = 'Ito';
console.log(firstName + ' ' + lastName);

// q3
console.log('問題3');

let product1 = 200;
let product2 = 250;
let subtotal = 0;
let tax = 0;
let total = 0;

subtotal = 200 * 3 + 250 * 4;
tax = subtotal * 0.1;
total = subtotal + tax;

console.log('小計');
console.log(subtotal + '円');
console.log('消費税');
console.log(tax + '円');
console.log('合計金額');
console.log(total + '円');

// q4
console.log('問題4');

let testScore = 80;

if (testScore >= 0 && testScore <= 79) {
    console.log('追試です');
} else if (testScore >= 80 && testScore <= 100) {
    console.log('合格です');
} else {
    console.log('存在しない点数です');
}

// q5
console.log('問題5');

let sum = 0;
for (let i = 1; i <= 100; i++) {
    sum = sum + i;
}
console.log(sum);

// q6
console.log('問題6');

function add(num1, num2) {
    return num1 + num2;
}
function sub(num1, num2) {
    return num1 - num2;
}
function multi(num1, num2) {
    return num1 * num2;
}
function div(num1, num2) {
    return num1 / num2;
}
console.log('5 + 3 = ' + add(5,3));
console.log('5 - 3 = ' + sub(5,3));
console.log('5 * 3 = ' + multi(5,3));
console.log('5 / 3 = ' + div(5,3));
