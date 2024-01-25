const str=window.prompt("Enter Any String");
check(str);

    function check(str){
        let count=0;
        for(const st of str){
        if(st==="a"||st==="e"||st==="i"||st==="o"||st==="u"){
            count++;
        }
     }
        document.write(count);
        // console.log(count);
    }


