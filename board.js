let board = [
    ['r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
    ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R']
]

function updateBoardUI() {
    const chessboard = document.querySelector('.chessboard');
    chessboard.innerHTML = '';
  
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 8; j++) {
        const square = document.createElement('div');
        square.classList.add('square');
        square.classList.add((i + j) % 2 === 0 ? 'light' : 'dark');
  
        const piece = document.createElement('div');
        piece.classList.add('piece');
        piece.innerText = boardState[i][j];
  
        square.appendChild(piece);
        chessboard.appendChild(square);
      }
    }
  }

// Function to handle user interactions (e.g., clicking a square)
function handleSquareClick(event) {
    const selectedSquare = event.target;
    // Get the row and column of the selected square and perform logic based on the click
  
    // Example: If the square is clicked, toggle a class to highlight it
    selectedSquare.classList.toggle('selected');
}

// Attach event listeners to squares
const squares = document.querySelectorAll('.square');
squares.forEach(square => {
    square.addEventListener('click', handleSquareClick);
});

// Update the initial board UI
updateBoardUI();