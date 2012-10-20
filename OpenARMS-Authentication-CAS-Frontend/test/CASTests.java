import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import play.mvc.Router;
import play.test.BaseTest;
import api.requests.GenerateCASAuthChallengeRequest;
import api.responses.GenerateCASAuthChallengeResponse;
import controllers.APIClient;


public class CASTests extends BaseTest {

	@Test
	public void fetchChallenge() throws MalformedURLException {
		GenerateCASAuthChallengeRequest req = new GenerateCASAuthChallengeRequest();
		req.service = new URL(Router.getFullUrl("Application.index"));
		GenerateCASAuthChallengeResponse res = (GenerateCASAuthChallengeResponse) APIClient.send(req);
		assertTrue(res.success());
		
	}
}
