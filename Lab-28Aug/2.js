function val(){
   alert('Form sucessfully submitted');
}

function checkage(val){
    var gn=document.getElementById('gn')
    var gs=document.getElementById('gs')
    if(val=='16 and below'){
       gn.style.display='block';
       gs.style.display='block';
    }
    else{
        gn.style.display='none';
        gs.style.display='none'; 
    }
}