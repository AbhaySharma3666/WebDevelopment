import React from 'react';

const StyleSheet = {
  color: 'blue',
  backgroundColor: 'lightgray',
  fontSize: '40px',
  fontFamily: 'Arial, sans-serif',
  textAlign: 'center',
  padding: '20px',
  borderRadius: '10px'
};

function Internal_CSS() {
  return (
    <h3 style={StyleSheet}>
      Internal CSS
    </h3>
  );
}

export default Internal_CSS;