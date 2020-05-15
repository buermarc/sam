"use strict";
const fetch = require("node-fetch");
const readline = require('readline-sync');       

async function a () {

    async function first() {

        let response = await fetch("http://localhost:9999/api/liga/", {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                "Accept-Content-Type": "application/json"
            },
        });

        let json = await response.json();
        console.log(JSON.stringify(json, null, 2));
        return json;
    }
	
    async function second(json) {
        let no = readline.question('Write the id of the liga you want to see?\n');

        let res = json._embedded.liga[no-1] 

        if (res == null) {
            console.log("Invalid Liga id. Please try again\n");
            return second(json);
        }

        let response = await fetch("http://localhost:9999/api/liga/"+no, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                "Accept-Content-Type": "application/json"
            },
        });

        let status = await response.status;
        if (status != 200) {
            console.log("Error invalid response: HTML Response: "+status+"\nTry again");
            await new Promise(r => setTimeout(r, 2000));
            return second(json);
        } else {
            let json = await response.json();
            console.log(JSON.stringify(json, null, 2));
            return json;
        }
    }

    async function third(json) {
        //TODO solve hardcoded string
        let stringHelp = ":: self \n:: liga \n:: divisions\n";

        let readline = require('readline-sync');       
        let no = readline.question('Write the name of the link you want to see?\n'+stringHelp);
        
        let url = await json._links[no];

        if (url == null) {
            console.log("Invalid link name. Please use one of the following links\n"+stringHelp)
            return third(json);
        }

        let response = await fetch(url, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                "Accept-Content-Type": "application/json"
            },
        });

        let status = await response.status;
        if (status != 200) {
            console.log("Error invalid response: HTML Response: "+status+"\nTry again");
            await new Promise(r => setTimeout(r, 2000));
            return third(json);
        } else {
            let json = await response.json();
            console.log(JSON.stringify(json, null, 2));
        }

    }

    let json = await first();
    json = await second(json);
    await third(json);
}
a();
