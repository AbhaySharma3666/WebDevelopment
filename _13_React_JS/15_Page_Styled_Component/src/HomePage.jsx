import React from "react";
import styled from "styled-components";

// Container
const Container = styled.div`
  font-family: "Poppins", sans-serif;
  margin: 0;
  padding: 0;
  background: #f9f9f9;
  color: #333;
`;

// Header
const Header = styled.header`
  background: #4f46e5;
  padding: 20px 50px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  color: white;
  position: sticky;
  top: 0;
  z-index: 1000;
`;

const Logo = styled.h1`
  font-size: 24px;
  font-weight: bold;
  cursor: pointer;

  &:hover {
    color: #facc15; /* yellow hover */
    transition: 0.3s ease;
  }
`;

const Nav = styled.nav`
  display: flex;
  gap: 20px;
`;

const NavLink = styled.a`
  text-decoration: none;
  color: white;
  font-weight: 500;
  position: relative;

  &:hover {
    color: #facc15;
  }

  /* underline hover effect */
  &::after {
    content: "";
    position: absolute;
    width: 0%;
    height: 2px;
    left: 0;
    bottom: -4px;
    background: #facc15;
    transition: width 0.3s ease-in-out;
  }

  &:hover::after {
    width: 100%;
  }
`;

// Hero Section
const Hero = styled.section`
  height: 90vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background: linear-gradient(to right, #6366f1, #4f46e5);
  color: white;
  text-align: center;
`;

const HeroTitle = styled.h2`
  font-size: 52px;
  margin-bottom: 20px;
  transition: transform 0.3s ease;

  &:hover {
    transform: scale(1.05);
  }
`;

const HeroSubtitle = styled.p`
  font-size: 20px;
  max-width: 650px;
  opacity: 0.9;
`;

const HeroButton = styled.button`
  margin-top: 30px;
  padding: 14px 32px;
  background: white;
  color: #4f46e5;
  font-size: 18px;
  font-weight: bold;
  border-radius: 30px;
  border: none;
  cursor: pointer;
  box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
  transition: all 0.3s ease;

  &:hover {
    background: #facc15;
    color: #111827;
    transform: translateY(-5px);
    box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.3);
  }
`;

// Features
const Features = styled.section`
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 30px;
  padding: 70px 80px;
  background: #fff;

  @media (max-width: 768px) {
    grid-template-columns: 1fr;
    text-align: center;
  }
`;

const FeatureCard = styled.div`
  padding: 30px;
  background: #f3f4f6;
  border-radius: 15px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
  text-align: center;
  transition: all 0.3s ease;

  &:hover {
    transform: translateY(-10px) scale(1.05);
    background: #eef2ff;
    box-shadow: 0 10px 20px rgba(79, 70, 229, 0.2);
  }
`;

const FeatureTitle = styled.h3`
  margin-bottom: 15px;
  color: #4f46e5;
  font-size: 22px;
`;

const FeatureDesc = styled.p`
  font-size: 16px;
  line-height: 1.6;
  color: #555;
`;

// Footer
const Footer = styled.footer`
  background: #111827;
  color: white;
  text-align: center;
  padding: 20px;
  font-size: 14px;
`;

const HomePage = () => {
  return (
    <Container>
      {/* Header */}
      <Header>
        <Logo>MyWebsite</Logo>
        <Nav>
          <NavLink href="#">Home</NavLink>
          <NavLink href="#">About</NavLink>
          <NavLink href="#">Services</NavLink>
          <NavLink href="#">Contact</NavLink>
        </Nav>
      </Header>

      {/* Hero */}
      <Hero>
        <HeroTitle>Welcome to My Website</HeroTitle>
        <HeroSubtitle>
          Build modern, responsive, and interactive websites with React and
          styled-components. Enjoy smooth animations and hover effects.
        </HeroSubtitle>
        <HeroButton>Get Started 🚀</HeroButton>
      </Hero>

      {/* Features */}
      <Features>
        <FeatureCard>
          <FeatureTitle>🚀 Fast</FeatureTitle>
          <FeatureDesc>
            Optimized for performance and speed with best React practices.
          </FeatureDesc>
        </FeatureCard>
        <FeatureCard>
          <FeatureTitle>🎨 Stylish</FeatureTitle>
          <FeatureDesc>
            Styled-components makes UI design easy, flexible, and reusable.
          </FeatureDesc>
        </FeatureCard>
        <FeatureCard>
          <FeatureTitle>📱 Responsive</FeatureTitle>
          <FeatureDesc>
            Works on all devices — desktop, tablet, and mobile screens.
          </FeatureDesc>
        </FeatureCard>
      </Features>

      {/* Footer */}
      <Footer>© 2025 MyWebsite | All Rights Reserved</Footer>
    </Container>
  );
};

export default HomePage;
