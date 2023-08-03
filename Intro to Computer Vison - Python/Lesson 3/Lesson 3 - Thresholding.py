import cv2

# Load the input image
image = cv2.imread('Assets/Tiger.jpg')

# Convert to grayscale (must be done before thresholding)
grayImage = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

# Apply binary thresholding
# All pixel values below the threshold will be set to 128 (black)
# All pixel values above the threshold will be set to 255 (white)
_, binary_image = cv2.threshold(grayImage, 128, 255, cv2.THRESH_BINARY)

# Inverse thresholding
_, binary_inv_image = cv2.threshold(grayImage, 128, 255, cv2.THRESH_BINARY_INV)

# Display the original and binary thresholded images
cv2.imshow('Original Image', image)
cv2.imshow('Binary Thresholded Image', binary_image)
cv2.imshow('Inverse Binary Thresholded Image', binary_inv_image)

# Wait for a key press and then close the windows
cv2.waitKey(0)
cv2.destroyAllWindows()
