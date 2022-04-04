var fibonacci = function (num) {
    if (num <= 1) {
        return num;
    }
    else {
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
};
var sum = 0;
for (var i = 0; i < 20; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("Tổng 20 số trong dãy fibonacci là :" + sum);
