const express = require("express");
const path = require("path");

const app = express();

app.get("/download", (req, res) => {

    const filePath = path.join(__dirname, "files", "sample.txt");

    // Keep same extension
    res.download(filePath, "my-file.txt", (err) => {
        if (err) {
            console.error("Error downloading file:", err);
            res.status(500).send("Error downloading file");
        }
    });

});

app.listen(3000, () => {
    console.log("Server running at http://localhost:3000");
});