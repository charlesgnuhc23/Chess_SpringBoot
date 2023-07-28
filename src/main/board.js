// const board = [
//     ['r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'],
//     ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
//     [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
//     [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
//     [' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '],
//     [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
//     ['P', 'P', 'P', 'P', ' ', 'P', 'P', 'P'],
//     ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R']
// ];

async function fetchBoardStateFromBackend() {
    try {
        const response = await fetch('/getBoardState');
        if (!response.ok) {
            throw new Error('Failed to fetch board state from the backend');
        }
        const jsonData = await response.json();
        return jsonData;
    } 

    catch (error) {
        console.error(error);
        return null;
    }
}

// function populateChessboard() {
//     for (let i = 0; i < 8; i++) {
//         for (let j = 0; j < 8; j++) {
//             const piece = document.getElementById(`piece-${i}-${j}`);
//             piece.innerHTML = getPieceImage(fetchBoardStateFromBackend()[i][j]);
//             // piece.innerHTML = getPieceImage(board[i][j]);
//         }
//     }
// }

async function populateChessboard() {
    try {
        const jsonDataFromBackend = await fetchBoardStateFromBackend();
        if (!jsonDataFromBackend) {
            // Handle the error or retry logic here if fetching the data fails
            return;
        }
  
        // Parse the JSON data to get board array
        const board = JSON.parse(jsonDataFromBackend);
    
        for (let i = 0; i < 8; i++) {
            for (let j = 0; j < 8; j++) {
                const piece = document.getElementById(`piece-${i}-${j}`);
                piece.innerHTML = getPieceImage(board[i][j]);
            }
        }

        console.log(jsonDataFromBackend);
    } 
    
    catch (error) {
        console.error('Error populating chessboard:', error);
    }
}

function getPieceImage(pieceCode) {
    const pieceImages = {
        'r': 'images/blackRook.png',
        'n': 'images/blackKnight.png',
        'b': 'images/blackBishop.png',
        'q': 'images/blackQueen.png',
        'k': 'images/blackKing.png',
        'p': 'images/blackPawn.png',
        'R': 'images/whiteRook.png',
        'N': 'images/whiteKnight.png',
        'B': 'images/whiteBishop.png',
        'Q': 'images/whiteQueen.png',
        'K': 'images/whiteKing.png',
        'P': 'images/whitePawn.png'
    };

    if (pieceCode === ' ') {
        return '<div class="piece"></div>';;
    }

    return `<img src="${pieceImages[pieceCode]}">`;
}

populateChessboard();