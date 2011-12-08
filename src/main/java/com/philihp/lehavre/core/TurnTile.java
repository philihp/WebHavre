package com.philihp.lehavre.core;

public enum TurnTile {
	WOODFISHINTEREST {
		void stock(BoardState board) {
			board.woodOffer++;
			board.fishOffer++;
			board.payInterest();
		}
	},
	COINIRON {
		void stock(BoardState board) {
			board.coinOffer++;
			board.ironOffer++;
		}
	},
	GRAINFISH {
		void stock(BoardState board) {
			board.grainOffer++;
			board.fishOffer++;
		}
	},
	WOODCATTLE {
		void stock(BoardState board) {
			board.woodOffer++;
			board.cattleOffer++;
		}
	},
	WOODCOIN {
		void stock(BoardState board) {
			board.woodOffer++;
			board.coinOffer++;
		}
	},
	FISHCLAY {
		void stock(BoardState board) {
			board.fishOffer++;
			board.clayOffer++;
		}
	},
	WOODCLAY {
		void stock(BoardState board) {
			board.woodOffer++;
			board.clayOffer++;
		}
	};

	abstract void stock(BoardState board);
}
