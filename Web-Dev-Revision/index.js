
let box1=document.getElementById("box1");
let box2=document.getElementById("box2");
let box=document.getElementsByClassName("box")

console.log(box)

let btn1=document.getElementById("btn1");
let btn2=document.getElementById("btn2");

btn1.onclick=increament;
btn2.onclick=decreament;

let targeth2=document.getElementById("alert1");
let target2h2=document.getElementById("alert2");


let var1
function increament(){
  
  var1=box1.innerText
  if(var1>0 && var1>=10){
    targeth2.style.borderColor='red' 
  }
  else{
    target2h2.style.borderColor='white'
    box1.innerText++;
    box2.innerText--
  }

}

let var2
function decreament(){
  var2=box2.innerText
  if(var2>0 && var2>=10){
    target2h2.style.borderColor='red' 
  }
  else{
    targeth2.style.borderColor='white '
    box2.innerText++;
    box1.innerText--
  }
}




























