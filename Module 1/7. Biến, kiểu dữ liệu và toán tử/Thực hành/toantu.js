let inputwidth;
let inputheight;

inputwidth = prompt("Enter the width");
document.write("Enterr the width: <br>" + inputwidth);
document.write("</br>");
inputheight = prompt("Enter the height");
document.write("Enter the width: <br>" + inputheight);
document.write("<br>")

let width = parseInt(inputwidth);
let height = parseInt(inputheight);

let area = width * height;
document.write("The area is:" + area);
