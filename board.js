const board = [
    ['r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
    ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R']
];

function populateChessboard() {
    for (let i = 0; i < 8; i++) {
        for (let j = 0; j < 8; j++) {
            const piece = document.getElementById(`piece-${i}-${j}`);
            piece.innerHTML = getPieceImage(board[i][j]);
        }
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
        return '';
    }

    return `<img src="${pieceImages[pieceCode]}">`;
}

populateChessboard();