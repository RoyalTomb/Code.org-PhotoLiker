// Create and assign values to your variables
var upButton;
var downButton;
var likeCounterOutput = 0;
var comments = "OMG soooo cute!";
var message = getText("newCommentInput");
onEvent("upButton", "click", function( ) {
  likeCounterOutput = likeCounterOutput + 1;
  setProperty("likeCounterOutput", "text", likeCounterOutput);
});
onEvent("downButton", "click", function( ) {
  likeCounterOutput = likeCounterOutput - 1;
  setProperty("likeCounterOutput", "text", likeCounterOutput);
});

onEvent("commentButton", "click", function( ) {
  comments = comments + "\n" + getText("newCommentInput");
  setText("allCommentsOutput", comments);
});
