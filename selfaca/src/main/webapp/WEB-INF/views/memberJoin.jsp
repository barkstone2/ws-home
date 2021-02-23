<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	
	<form name="mJoinForm" method="post" action="joinProc">
		아이디 : <input type="text" name="mId"><br>
		비밀번호 : <input type="password" name="mPw"><br>
		비밀번호 확인 : <input type="password" name="mPwc"><br>
		이름 : <input type="text" name="mName"><br>
		<input type="button" value="가입하기" onclick="mJoin()">
		<input type="button" value="홈으로" onclick="location.href='/'">
	</form>
</body>
<script>
function mJoin(){
	if(confirm('가입하시겠습니까?')){
		if(mJoinForm.mId.value==""){
			alert('아이디를 입력하세요.');
			mJoinForm.mId.focus();
			return true;
		}else if(mJoinForm.mPw.value===""){
			alert('비밀번호를 입력하세요.');
			mJoinForm.mPw.focus();
			return true;
		}else if(mJoinForm.mPwc.value==""){
			alert('비밀번호 확인란을 입력하세요.');
			mJoinForm.mPwCheck.focus();
			return true;
		}else if(mJoinForm.mName.value==""){
			alert('이름을 입력하세요.');
			mJoinForm.mName.focus();
			return true;
		}else{
			if(mJoinForm.mPw.value==mJoinForm.mPwc.value){
				mJoinForm.submit();
			}else{
				alert('비밀번호가 일치하지 않습니다.');
				mJoinForm.mPwc.focus();
				return true;
			}
		}
	}
}
</script>
</html>