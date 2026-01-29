

function PassingHtml({children, color = "green"}) {
  return (
    <div style={{
        color: color,
        fontSize: '20px',
        backgroundColor: 'yellow',
        padding: '10px',
        margin: '10px',
        borderRadius: '10px',
        border: '2px solid black'
    }}>{children}</div>
  )
}

export default PassingHtml