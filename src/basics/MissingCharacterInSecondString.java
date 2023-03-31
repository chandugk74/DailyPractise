package basics;

public class MissingCharacterInSecondString {

	public static void main(String[] args) {
		const a = "aabbccc"
				const b = "aabcc"

				let res = ""

				for (let i = 0, j = 0; i <= a.length; i++, j++) {
				  if (a[i] !== b[j]) { 
				    res += a[i]
				    i++
				  }
				}

				console.log(res)

	}

}
