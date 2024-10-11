console.log("Calling Function");

const fetch = async () => {
    const response = await fetch("https://chatbot.digitalneurones.ai/ask_gpt", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            // "Authorization": "Bearer YOUR_API_KEY",
            "Access-Control-Allow-Origin": "*"
        },
        body: JSON.stringify({
            "prompt": "What is the capital of France?"
        })
    })

    return response
}

const response = fetch()