"use strict";
const fetch = require("node-fetch");
async function a () {
    let request = {
        winnerTeam: "/api/team/2"
    }

    let response = await fetch("http://localhost:9999/api/game/3", {
        method: "PATCH",
        headers: {
            "Content-Type": "application/json",
            "Accept-Content-Type": "application/json"
        },
        body: JSON.stringify(request)
    });

    let json = await response.json();
    console.log(json);
        
}
a();
