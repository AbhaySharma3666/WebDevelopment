document.getElementById("search-btn").addEventListener("click", async () => {
    const username = document.getElementById("user-input").value.trim();
    if (!username) return alert("Please enter a valid username");

    const proxyUrl = 'https://cors-anywhere.herokuapp.com/';
    const targetUrl = 'https://leetcode.com/graphql';

    const query = `
    query getUserStats($username: String!) {
        allQuestionsCount { difficulty count }
        matchedUser(username: $username) {
            submitStats {
                acSubmissionNum { difficulty count }
                totalSubmissionNum { difficulty submissions }
            }
        }
    }
    `;

    const response = await fetch(proxyUrl + targetUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ query, variables: { username } })
    });

    if (!response.ok) return alert("Failed to fetch user data.");

    const { data } = await response.json();

    const easy = data.matchedUser.submitStats.acSubmissionNum.find(x => x.difficulty === "Easy");
    const medium = data.matchedUser.submitStats.acSubmissionNum.find(x => x.difficulty === "Medium");
    const hard = data.matchedUser.submitStats.acSubmissionNum.find(x => x.difficulty === "Hard");

    const totalEasy = data.allQuestionsCount.find(x => x.difficulty === "Easy").count;
    const totalMedium = data.allQuestionsCount.find(x => x.difficulty === "Medium").count;
    const totalHard = data.allQuestionsCount.find(x => x.difficulty === "Hard").count;

    document.getElementById("easy-label").innerText = `${easy.count}/${totalEasy}`;
    document.getElementById("medium-label").innerText = `${medium.count}/${totalMedium}`;
    document.getElementById("hard-label").innerText = `${hard.count}/${totalHard}`;

    document.getElementById("easy-circle").style.setProperty("--progress", `${(easy.count / totalEasy) * 100}%`);
    document.getElementById("medium-circle").style.setProperty("--progress", `${(medium.count / totalMedium) * 100}%`);
    document.getElementById("hard-circle").style.setProperty("--progress", `${(hard.count / totalHard) * 100}%`);

    const cards = data.matchedUser.submitStats.totalSubmissionNum.map(obj => {
        return `<div class="card">
            <h4>${obj.difficulty} Submissions</h4>
            <p>${obj.submissions}</p>
        </div>`;
    }).join("");

    document.getElementById("stats-cards").innerHTML = cards;
});