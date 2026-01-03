function Home() {
    return (
        <div className="home-container">
            <div className="hero-section">
                <h1 className="hero-title">Welcome to My Home Page</h1>
                <p className="hero-subtitle">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. 
                    Neque veritatis doloremque, in sint, tempora obcaecati.
                </p>
                <button className="cta-button">Get Started</button>
            </div>
            
            <div className="features-section">
                <div className="feature-card">
                    <div className="feature-icon">🚀</div>
                    <h3 className="feature-title">Fast Performance</h3>
                    <p className="feature-description">
                        Lightning fast loading times and smooth user experience.
                    </p>
                </div>
                
                <div className="feature-card">
                    <div className="feature-icon">🎨</div>
                    <h3 className="feature-title">Modern Design</h3>
                    <p className="feature-description">
                        Beautiful and responsive design that works on all devices.
                    </p>
                </div>
                
                <div className="feature-card">
                    <div className="feature-icon">⚡</div>
                    <h3 className="feature-title">Easy to Use</h3>
                    <p className="feature-description">
                        Intuitive interface that makes everything simple and accessible.
                    </p>
                </div>
            </div>
        </div>
    )
}

export default Home