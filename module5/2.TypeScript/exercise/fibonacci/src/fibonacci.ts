let fibonacci = (num:number): number =>{
    if (num <= 1){
        return num;
    }else {
        return fibonacci(num -1) + fibonacci(num -2);
    }
}
let sum = 0;
for (let i=0 ; i < 20;i++){
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("Tổng 20 số trong dãy fibonacci là :" + sum);