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
        mode: "no-cors",
        headers: {
            "Content-Type": "application/json",
            "Accept-Content-Type": "application/json"
        },
    });

    let json = await response.json();
    console.log(json);
        
}
a();
