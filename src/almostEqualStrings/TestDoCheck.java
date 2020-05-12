package almostEqualStrings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDoCheck {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		AlmostEqualStrings junit = new AlmostEqualStrings();
		
		List<String> s =  new ArrayList<>();
		s.add("abcd");
		s.add("brraz");
		
		List<String> t =  new ArrayList<>();
		t.add("aaaa");
		t.add("ooooo");
		
		List<String> res =  new ArrayList<>();
		res.add("Yes");
		res.add("No");
		
		assertEquals(res, junit.doCheck(s, t));
		
	}

}
