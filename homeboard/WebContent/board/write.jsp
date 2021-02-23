<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
</head>
<body>

	<form name="bWriteForm" method="post" action="write.proc">
		<div style="width: 800px; height: 600px; border: 1px solid black">
			<div style="display: flex; border-bottom: 1px solid black;">
				<div style="width: 20%; height: 50px; text-align: center; line-height: 50px; border-right: 1px solid black;">
				제목
				</div>
				<div style="width: 80%; height: 50px; text-align: center; line-height: 50px;">
					<input type="text" name="bSubject" style="width: 90%;">
				</div>
			</div>
			<div style="display: flex; justify-content:flex-end; border-bottom: 1px solid black; height: 50px;">
				<div style="margin-right: 10px;">
					<div style="text-align: center;">글쓴이</div>
					<div><input type="text" name="bWriter"></div>
				</div>
				<div style="margin-right: 20px;">
					<div style="text-align: center;">비밀번호</div>
					<div><input type="password" name="bPw"></div>
				</div>
			</div>
			<div style="display: flex; height: 500px;">
				<div style="width:20%; height: 500px; text-align: center; line-height: 500px; border-right: 1px solid black;">내용</div>
				<div style="width:80%; text-align: center;">
					<textarea style="height: 480px; width: 90%; resize: none; margin-top: 5px;"></textarea>
				</div>
			</div>
		</div>
		<div style="width:800px; display: flex; justify-content: flex-end; margin-top: 10px;">
			<input style="margin-right: 10px;" type="button" value="글쓰기" onclick="bWrite();">
			<input type="button" value="목록으로">
		</div>
	</form>
</body>
<script>
	function bWrite(){
		if(confirm('작성하시겠습니까?')){
			if(bWriteForm.bSubject.value==null){
				alert('제목을 입력하세요.');
				bWriteForm.bSubject.focus();
			}
		}
	}
</script>

</html>