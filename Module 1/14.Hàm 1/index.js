function square(number) {
    let result = number *number;
    return result;
}
function calculate() {
    let input = document.getElementById("input").value;
    let result = square(input);
    document.getElementById("result").innerHTML=result;

}
function myFunction() {
    let firstArg = arguments[0];
    let secondArg = arguments[1];
    alert("firstArg is: " + firstArg);
    alert("secondArg is: " + secondArg);
}
myFunction("hello","world");
