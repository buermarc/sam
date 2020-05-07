"use strict";
const fetch = require("node-fetch");
async function a () {

    let request = {
        name: "NewGame",
        teams: ["/api/team/1", "/api/team/2"],
        winnerTeam: "/api/team/2", 
        division: "/api/division/1",
    }

    let response = await fetch("http://localhost:9999/api/liga/", {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
            "Accept-Content-Type": "application/json"
        },
    });

    let json = await response.json();
    console.log(JSON.stringify(json, null, 2));
	
	let readline = require('readline-sync');       
    let no = readline.question('Write the id of the liga you want to see?\n');

    response = await fetch("http://localhost:9999/api/liga/"+no, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
            "Accept-Content-Type": "application/json"
        },
    });

    json = await response.json();
    console.log(JSON.stringify(json, null, 2));
}
a();
