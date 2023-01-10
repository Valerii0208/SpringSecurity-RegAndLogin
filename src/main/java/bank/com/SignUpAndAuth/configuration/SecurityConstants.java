package bank.com.SignUpAndAuth.configuration;

public final class SecurityConstants {
    public static final String USER_ID = "userId";
    public static final int EXPIRATION_DATE = 864_000_000;
    public static final String SECRET = "Secret";
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";

    private SecurityConstants() {
    }
}
