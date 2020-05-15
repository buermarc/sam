"use strict";
const fetch = require("node-fetch");
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
    }
	
    async function second() {
        let readline = require('readline-sync');       
        let no = readline.question('Write the id of the liga you want to see?\n');

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
            second();
        } else {
            let json = await response.json();
            console.log(JSON.stringify(json, null, 2));
        }
    }

    await first();
    await second();
}
a();
