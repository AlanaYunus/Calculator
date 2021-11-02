public class IncorrectInputException extends RuntimeException {

        public IncorrectInputException () {
            super(ExceptionMessages.INCORRECT_EXPRESSION_MESSAGE);

        }

        public IncorrectInputException (String message) {
            super(message);

        }
    }



