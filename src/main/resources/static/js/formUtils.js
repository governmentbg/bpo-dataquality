var RequestUtils = {
    post: function (url, parameters) {
        let myForm = document.createElement("form");
        myForm.method = "post";
        myForm.action = url;
        for (let k in parameters) {
            let myInput = document.createElement("input");
            myInput.setAttribute("name", k);
            myInput.setAttribute("value", parameters[k]);
            myForm.appendChild(myInput);
        }
        document.body.appendChild(myForm);
        myForm.submit();
        document.body.removeChild(myForm);
    },
    get: function (url, parameters) {
        let myForm = document.createElement("form");
        myForm.method = "get";
        myForm.action = url;
        for (let k in parameters) {
            let myInput = document.createElement("input");
            myInput.setAttribute("name", k);
            myInput.setAttribute("value", parameters[k]);
            myForm.appendChild(myInput);
        }
        document.body.appendChild(myForm);
        myForm.submit();
        document.body.removeChild(myForm);
    },
};