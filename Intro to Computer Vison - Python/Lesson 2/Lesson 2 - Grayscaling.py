import cv2
# Read the image from the specified path
image = cv2.imread('Assets/tiger.jpg')

# Convert the image to grayscale
grayScaleImage = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

# Display the grayscale image
cv2.imshow('Gray Scaled Image', grayScaleImage)

# Wait for a key press and then close all windows
cv2.waitKey()
cv2.destroyAllWindows()
