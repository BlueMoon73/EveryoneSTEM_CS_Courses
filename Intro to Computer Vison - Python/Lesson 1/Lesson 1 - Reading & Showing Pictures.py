import cv2

# Load the image
image = cv2.imread('Assets/tiger.jpg')

# show the image
cv2.imshow("Tiger Picture", image)

# Wait for a key press and then close the windows
cv2.waitKey(0)
cv2.destroyAllWindows()
