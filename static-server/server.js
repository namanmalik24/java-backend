const express = require('express')
const path = require('path')

const app = express()

// Serve static files from 'public' folder
app.use(express.static(path.join(__dirname, 'public')))

// Home route
app.get('/', (req, res) => {
    res.send(`
        <h1>Random Image Below 👇</h1>
        <img src="/image.jpg" width="400"/>
    `)
})

app.listen(3000, () => {
    console.log('Server running at http://localhost:3000')
})